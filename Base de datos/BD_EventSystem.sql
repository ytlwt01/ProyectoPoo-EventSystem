CREATE DATABASE EventSystem
GO
USE [EventSystem]
GO
/****** Object:  Table [dbo].[GruposVsMiembros]    Script Date: 04/17/2017 09:12:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GruposVsMiembros](
	[CodGrupo] [int] NULL,
	[CodMiembro] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Grupos]    Script Date: 04/17/2017 09:12:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Grupos](
	[CodGrupo] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](50) NULL,
	[CodUsuario] [int] NULL,
 CONSTRAINT [PK_Grupos] PRIMARY KEY CLUSTERED 
(
	[CodGrupo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[EventosVsMiembros]    Script Date: 04/17/2017 09:12:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[EventosVsMiembros](
	[CodEvento] [int] NULL,
	[CodMiembro] [int] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Eventos]    Script Date: 04/17/2017 09:12:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Eventos](
	[CodEvento] [int] IDENTITY(1,1) NOT NULL,
	[Descripcion] [varchar](100) NULL,
	[Mensaje] [text] NULL,
	[Fecha] [date] NULL,
	[CodUsuario] [int] NULL,
 CONSTRAINT [PK_Eventos] PRIMARY KEY CLUSTERED 
(
	[CodEvento] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Miembros]    Script Date: 04/17/2017 09:12:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Miembros](
	[CodMiembro] [int] IDENTITY(1,1) NOT NULL,
	[Nombre] [varchar](50) NULL,
	[Apellido] [varchar](50) NULL,
	[Correo] [varchar](50) NULL,
	[CodUsuario] [int] NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Usuarios]    Script Date: 04/17/2017 09:12:46 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Usuarios](
	[CodUsuario] [int] IDENTITY(1,1) NOT NULL,
	[Usuario] [varchar](50) NULL,
	[Password] [varchar](50) NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  StoredProcedure [dbo].[NotificarEvento]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[NotificarEvento] @CodEv int, @CodUsu int

as

if(exists(select CodEvento from  EventSystem.dbo.Eventos where CodEvento=@CodEv and CodUsuario=@CodUsu))
begin
		
		

declare @CodEvento int, @Descripcion varchar(100) ,@Mensaje Varchar(MAX), @Fecha date, @CodUsuario int, @CodMiembro int, @Nombre varchar(50), @Apellido varchar(50), @Correo varchar(50)


declare Cursor_Miembros cursor for select E.CodEvento, E.Descripcion, E.Mensaje, E.Fecha, E.CodUsuario, M.CodMiembro, M.Nombre, M.Apellido, M.Correo FROM EventSystem.dbo.Eventos E inner join EventSystem.dbo.EventosVsMiembros EvsM on E.CodEvento = EvsM.CodEvento inner join Miembros M on M.CodMiembro = EvsM.CodMiembro where E.CodEvento = @CodEv and E.CodUsuario = @CodUsu


open Cursor_Miembros

FETCH Cursor_Miembros into @CodEvento, @Descripcion ,@Mensaje, @Fecha, @CodUsuario, @CodMiembro, @Nombre, @Apellido, @Correo 

WHILE (@@FETCH_STATUS = 0 )
BEGIN


	
	if (@CodEvento = @CodEv and @CodUsuario = @CodUsu)
	BEGIN

	
    declare @MensajeCompleto varchar(MAX) = '<!DOCTYPE html><html><body><p>'+'Hola '+@Nombre+' '+@Apellido+'<br><br>'+@Mensaje+'<br>'+'</p> </body></html>'
    
	delete from EventSystem.dbo.EventosVsMiembros where CodMiembro=@CodMiembro and CodEvento = @CodEvento
    
   
    EXEC [msdb].dbo.sp_send_dbmail

      @profile_name = 'PerfilBD',

      @recipients =@Correo,

      @subject = @Descripcion,
      
     
      @body = @MensajeCompleto,
      
       @body_format = 'HTML';
	
	END
	

	

FETCH Cursor_Miembros into @CodEvento, @Descripcion ,@Mensaje, @Fecha, @CodUsuario, @CodMiembro, @Nombre, @Apellido, @Correo 

END

close Cursor_Miembros
DEALLOCATE Cursor_Miembros


---Una vez que termino, ahora a borrar los eventos


declare @CodEvento2 int, @CodUsuario2 int
declare Cursor_Evento cursor for select CodEvento, CodUsuario FROM EventSystem.dbo.Eventos 
open Cursor_Evento

FETCH Cursor_Evento into @CodEvento2, @CodUsuario2

WHILE (@@FETCH_STATUS = 0 )
BEGIN


	
	if (@CodEvento2 = @CodEv and @CodUsuario2 = @CodUsu)
	BEGIN
	
	delete from EventSystem.dbo.Eventos where CodEvento=@CodEvento2 

	END

	

FETCH Cursor_Evento into @CodEvento2, @CodUsuario2

END

close Cursor_Evento
DEALLOCATE Cursor_Evento


	
end
GO
/****** Object:  StoredProcedure [dbo].[InsertarGruposVsMiembros]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[InsertarGruposVsMiembros] @CodGrupo int, @CodMiembro int

as

if(Not exists (select CodGrupo, CodMiembro FROM GruposVsMiembros where CodGrupo=@CodGrupo and CodMiembro=@CodMiembro))
begin
insert into GruposVsMiembros values(@CodGrupo,@CodMiembro)
end
GO
/****** Object:  StoredProcedure [dbo].[InsertarEventosVsMiembros]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[InsertarEventosVsMiembros] @CodEvento int, @CodMiembro int

as
if(Not exists (select CodEvento, CodMiembro FROM EventosVsMiembros where CodEvento=@CodEvento and CodMiembro=@CodMiembro))
begin
insert into EventosVsMiembros values(@CodEvento,@CodMiembro)
end
GO
/****** Object:  StoredProcedure [dbo].[EliminarUsuario]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[EliminarUsuario] @User varchar(50), @Contra varchar(50)

as


if(exists(select CodUsuario from Usuarios where Usuario=@User and Password=@Contra))
begin
	delete from Usuarios where Usuario=@User and Password=@Contra
end
GO
/****** Object:  StoredProcedure [dbo].[EliminarMiembroGrupo]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[EliminarMiembroGrupo]  @CodGrupo int, @CodMiembro int

as


if(exists(select CodMiembro,CodGrupo from GruposVsMiembros where CodMiembro=@CodMiembro and CodGrupo=@CodGrupo))
begin
			
			delete from GruposVsMiembros where CodMiembro=@CodMiembro and CodGrupo = @CodGrupo
		
end
GO
/****** Object:  StoredProcedure [dbo].[EliminarMiembro]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[EliminarMiembro]  @CodMiembro int, @CodUsuario int

as


if(exists(select CodMiembro from Miembros where CodMiembro=@CodMiembro and CodUsuario=@CodUsuario))
begin
			delete from Miembros where CodMiembro=@CodMiembro and CodUsuario=@CodUsuario
			delete from EventosVsMiembros where CodMiembro=@CodMiembro 
			delete from GruposVsMiembros where CodMiembro=@CodMiembro 
end
GO
/****** Object:  StoredProcedure [dbo].[EliminarInvitado]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[EliminarInvitado]  @CodEvento int, @CodMiembro int

as


if(exists(select CodMiembro,CodEvento from EventosVsMiembros where CodMiembro=@CodMiembro and CodEvento=@CodEvento))
begin
			
			delete from EventosVsMiembros where CodMiembro=@CodMiembro and CodEvento = @CodEvento
		
end
GO
/****** Object:  StoredProcedure [dbo].[EliminarGrupo]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[EliminarGrupo]  @Codgrupo int, @CodUsuario int

as


if(exists(select Codgrupo from Grupos where Codgrupo=@Codgrupo and CodUsuario=@CodUsuario))
begin
			delete from Grupos where Codgrupo=@Codgrupo and CodUsuario=@CodUsuario
			delete from GruposVsMiembros where CodGrupo=@Codgrupo 
end
GO
/****** Object:  StoredProcedure [dbo].[EliminarEvento]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[EliminarEvento] @CodEvento int, @CodUsuario int

as


if(exists(select CodEvento from Eventos where CodEvento=@CodEvento and CodUsuario=@CodUsuario))
begin
		delete from Eventos where CodEvento=@CodEvento and CodUsuario=@CodUsuario
		delete from EventosVsMiembros where CodEvento=@CodEvento 
	
end
GO
/****** Object:  StoredProcedure [dbo].[CrearUsuario]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[CrearUsuario] @User varchar(50), @Contra varchar(50)

as


if(Not exists(select CodUsuario from Usuarios where Usuario=@User and Password=@Contra))
begin
	insert into Usuarios values(@User,@Contra)
end
GO
/****** Object:  StoredProcedure [dbo].[CrearGrupo]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CReate procedure [dbo].[CrearGrupo] @Nombre varchar(50), @CodUsu int

as


if(Not exists(select CodGrupo from Grupos where Nombre=@Nombre and CodUsuario=@CodUsu))
begin
	insert into Grupos values(@Nombre,@CodUsu)
end
GO
/****** Object:  StoredProcedure [dbo].[CrearEvento]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
Create procedure [dbo].[CrearEvento] @Descripcion varchar(100), @Texto text, @Fecha date, @CodUsuario int

as


if(Not exists(select CodEvento from Eventos where Descripcion=@Descripcion and Fecha=@Fecha and CodUsuario=@CodUsuario))
begin
	insert into Eventos values(@Descripcion,@Texto,@Fecha,@CodUsuario)
end
GO
/****** Object:  StoredProcedure [dbo].[AgregarMiembro]    Script Date: 04/17/2017 09:12:47 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE procedure [dbo].[AgregarMiembro] @Nombre varchar(50), @Apellido varchar(50), @Correo varchar(50), @CodUsuario int

as


if(Not exists(select CodMiembro from Miembros where Nombre=@Nombre and Apellido=@Apellido and Correo=@Correo and CodUsuario=@CodUsuario))
begin
	insert into Miembros values(@Nombre,@Apellido,@Correo,@CodUsuario)
end
GO
