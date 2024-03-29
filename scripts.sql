USE [MiMiFood]
GO
/****** Object:  Table [dbo].[Accounts]    Script Date: 12/3/2019 2:54:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accounts](
	[CustomerID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [nvarchar](30) NOT NULL,
	[Password] [nvarchar](30) NOT NULL,
	[Fullname] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NULL,
	[Address] [nvarchar](max) NULL,
	[Phone] [nvarchar](20) NULL,
	[Role] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[CustomerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Categories]    Script Date: 12/3/2019 2:54:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[CategoryID] [int] IDENTITY(1,1) NOT NULL,
	[CategoryName] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[CategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Foods]    Script Date: 12/3/2019 2:54:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Foods](
	[FoodID] [int] IDENTITY(1,1) NOT NULL,
	[FoodName] [nvarchar](50) NOT NULL,
	[Description] [nvarchar](max) NOT NULL,
	[UnitPrice] [float] NOT NULL,
	[Available] [bit] NOT NULL,
	[CategoryID] [int] NOT NULL,
	[Image] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[FoodID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetails]    Script Date: 12/3/2019 2:54:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetails](
	[OrderID] [int] NOT NULL,
	[FoodID] [int] NOT NULL,
	[Quantity] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC,
	[FoodID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 12/3/2019 2:54:38 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[CustomerID] [int] NOT NULL,
	[OrderDate] [date] NOT NULL,
	[Address] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Accounts] ON 

INSERT [dbo].[Accounts] ([CustomerID], [Username], [Password], [Fullname], [Email], [Address], [Phone], [Role]) VALUES (2, N'hamy', N'123', N'Trinh Thi Ha My', N'mytthhe130054@gmail.com', N'FPT University Hanoi Vietnam', N'0384631607', 0)
INSERT [dbo].[Accounts] ([CustomerID], [Username], [Password], [Fullname], [Email], [Address], [Phone], [Role]) VALUES (5, N'admin', N'123', N'Admin', N'admin@gmail.com', N'Hoa Lac, Viet Nam', N'0987654466', 1)
SET IDENTITY_INSERT [dbo].[Accounts] OFF
SET IDENTITY_INSERT [dbo].[Categories] ON 

INSERT [dbo].[Categories] ([CategoryID], [CategoryName]) VALUES (1, N'Daily dishes')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName]) VALUES (2, N'Noodle dishes')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName]) VALUES (3, N'Dumplings and Cake')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName]) VALUES (5, N'Snack')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName]) VALUES (6, N'Rolls and rice paper')
SET IDENTITY_INSERT [dbo].[Categories] OFF
SET IDENTITY_INSERT [dbo].[Foods] ON 

INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (2, N'Snack bim bim Cua', N'
Made from fresh, big, strongest crabs in the world.', 1.99, 1, 5, N'images/snack/snackcua.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (4, N'Miniket ', N'
The unique type of noodles associated with childhood Vietnamese.', 2.03, 1, 5, N'images/snack/miniket.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (6, N'Snack bim bim Tom', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors', 1.89, 1, 5, N'images/snack/bimbimtom.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (8, N'Color candy M&M', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 3.21, 1, 5, N'images/snack/keomm.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (11, N'Milk Old Grandpa - Sua Ong Tho', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 5.98, 1, 5, N'images/snack/sua ong to.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (14, N'Candy Alpenliebe', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 4.37, 1, 5, N'images/snack/alpen.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (17, N'Che thap cam', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 10.76, 1, 5, N'images/snack/chethapcam.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (19, N'Xoi sinh vien', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 6.43, 1, 1, N'images/vn/xoixin.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (21, N'Sup bi do - 
Red pumpkin', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 9.45, 1, 1, N'images/vn/supbido.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (22, N'Com tam', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 7.89, 1, 1, N'images/vn/chatrung.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (23, N'Thit kho tau', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 7.45, 1, 1, N'images/vn/thitkhotau.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (24, N'Rau song', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 1.23, 1, 1, N'images/vn/rausong.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (25, N'Ca kho', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 9.43, 1, 1, N'images/vn/cakho.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (26, N'Cha la lot', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 6.66, 1, 1, N'images/vn/chalalot.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (27, N'Banh da thap cam', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 9.54, 1, 2, N'images/vn/banhda.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (28, N'Mi soi thom ngon', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 7.66, 1, 2, N'images/vn/bg6.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (29, N'Pho Bo', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 9.99, 1, 2, N'images/vn/phobo.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (30, N'Banh canh ca loc', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 7.88, 1, 2, N'images/vn/banhcanhcaloc.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (31, N'Banh da sieu ngon', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 8.66, 1, 2, N'images/vn/banhgidayleuleu.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (32, N'Bun bo Hue', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 8.9, 1, 2, N'images/vn/bunbohue.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (34, N'Bun ca sieu cay', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 9.42, 1, 2, N'images/vn/bun ca.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (35, N'Bun cha Obama', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 10.23, 1, 2, N'images/vn/buncha.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (36, N'Cha ca La Vong', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 11.21, 1, 2, N'images/vn/chacalavong.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (40, N'Mi quang ech Da Nang', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 12.11, 1, 2, N'images/vn/miquangechdanang.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (41, N'Mi tom sinh vien', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 3.43, 1, 2, N'images/vn/mitomsv.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (42, N'Banh troi banh chay', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 7.34, 1, 3, N'images/vn/banhbotloc.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (44, N'Banh chung - Chung Cake', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 20.32, 1, 3, N'images/vn/banhchung.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (45, N'Banh mi dan to', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 3.22, 1, 3, N'images/vn/banhmi2.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (46, N'Banh trang nuong', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 8.44, 1, 3, N'images/vn/banhtrangnuong.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (47, N'Banh cuon', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 5.83, 1, 3, N'images/vn/banhcuon.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (48, N'Banh la sen', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 7.89, 1, 3, N'images/vn/xoilasen.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (49, N'Banh com Lang Vong', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 8.54, 1, 3, N'images/vn/banhcom.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (50, N'Mut Tet ', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 19.88, 1, 3, N'images/vn/tet.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (51, N'Banh cau vong', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 7.99, 1, 3, N'images/vn/nhieumau.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (52, N'Banh gio', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 8.77, 1, 3, N'images/vn/banhgio.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (53, N'Banh ran vung', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 1.22, 1, 3, N'images/vn/banhranvung.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (54, N'Banh do goi la', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 5.23, 1, 3, N'images/vn/banhgido.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (56, N'Nem dac san - Spring rolls', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 29.32, 1, 6, N'images/vn/nem.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (57, N'Goi cuon tom', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 13, 1, 6, N'images/vn/goicuon2.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (58, N'Nem chua Thanh Hoa', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 22.41, 1, 6, N'images/vn/bg7.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (59, N'Nem nuong Nha Trang', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 13.44, 1, 6, N'images/vn/bg4.jpg')
INSERT [dbo].[Foods] ([FoodID], [FoodName], [Description], [UnitPrice], [Available], [CategoryID], [Image]) VALUES (60, N'Goi cuon chay', N'Delicious food of Vietnamese people. famous in the world. topped among the dishes that left an impression on foreign visitors.', 10.74, 1, 6, N'images/vn/goicuon.jpg')
SET IDENTITY_INSERT [dbo].[Foods] OFF
ALTER TABLE [dbo].[Foods]  WITH CHECK ADD FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Categories] ([CategoryID])
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD FOREIGN KEY([FoodID])
REFERENCES [dbo].[Foods] ([FoodID])
GO
ALTER TABLE [dbo].[OrderDetails]  WITH CHECK ADD FOREIGN KEY([OrderID])
REFERENCES [dbo].[Orders] ([OrderID])
GO
ALTER TABLE [dbo].[Orders]  WITH CHECK ADD FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Accounts] ([CustomerID])
GO
