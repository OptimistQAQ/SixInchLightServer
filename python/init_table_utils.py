from sqlalchemy.orm import sessionmaker
from sqlalchemy.ext.declarative import declarative_base
import sqlalchemy as db
from sqlalchemy import engine

my_engine = engine.create_engine("mysql+pymysql://root:123456@localhost:3306/xinxin?charset=utf8mb4")
session = sessionmaker(bind=my_engine)
Base = declarative_base()

class User(Base):
    __tablename__ = "User"
    Uname = db.Column(db.String(32), nullable=False, unique=True, index=True)  # 账号
    Unick_name = db.Column(db.String(64), nullable=False, server_default="游客")  # 昵称
    Uno = db.Column(db.Integer, autoincrement=True, primary_key=True)  # id
    Upassword = db.Column(db.String(32), nullable=False)  # 密码
    Uprofile_photo = db.Column(db.String(256), server_default="http://ishero.net/share/06.png")  # 头像
    Utotal_time = db.Column(db.Integer, server_default='10')  # 已喜欢数量
    Utotal_distance = db.Column(db.Integer, server_default='10')  # 发表篇数
    Utotal_line = db.Column(db.Integer, server_default='10')  # 被赞篇数

class Admin(Base):
    __tablename__ = "Admin"
    Ano = db.Column(db.Integer, db.ForeignKey('User.Uno'), primary_key=True)  # 管理员id
    Utitle = db.Column(db.String(16))  # 账号

class Flower(Base):
    __tablename__ = "Flower"
    Fno = db.Column(db.Integer, autoincrement=True, primary_key=True)  # id
    Fname = db.Column(db.String(32), nullable=False, server_default="花卉")  # 花卉名称
    Fintroduce = db.Column(db.String(512), server_default="花卉")  # 花卉介绍
    Fvalue = db.Column(db.String(512), server_default="无")  # 营养价值
    Fpart = db.Column(db.String(512), server_default="花瓣")  # 可食部位

class FlowerInformation(Base):
    __tablename__ = "FlowerInformation"
    Ino = db.Column(db.Integer, autoincrement=True, primary_key=True)
    Iname = db.Column(db.String(64), nullable=False, server_default="花卉资讯")
    Imessage = db.Column(db.String(512), server_default="message")
    Iphoto = db.Column(db.String(128), server_default="http://img-arch.pconline.com.cn/images/upload/upc/tx/photoblog/1103/20/c9/7059208_7059208_1300628027484.jpg")

class Attention(Base):
    __tablename__ = "Attention"
    Ano = db.Column(db.Integer, primary_key=True, autoincrement=True)
    Fno = db.Column(db.ForeignKey("Flower.Fno"))
    Aintroduce = db.Column(db.String(512), server_default="无")

if __name__ == "__main__":
    Base.metadata.create_all(my_engine)