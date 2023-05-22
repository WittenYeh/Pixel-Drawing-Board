<font face = "华文中宋">

# Pixel-Drawing-Board

## Introduction

Funny multiplayer pixel drawing game. One of the graduation activities of Information School，Renmin University of China.

# 需求文档

- [ ] 登入系统  
  - [ ] 邮箱验证：向指定邮箱发送验证码，检查验证码，确定是来自 RUC 的用户
  - [ ] 账号管理系统：管理每个用户的账号和密码
  - [ ] 安全系统：选做
- [ ] UI  界面
  - [ ] 全局 UI 界面：在这个界面可以看到所有用户的绘制作品。下方还附有一个输入框。可以输入一些命令或键入评论。
        <center><img src = /images/0.png width = 30%></center>
  - [ ] 个人工作区 UI 界面：用户自己的工作区界面，包括工具栏和作图板。
        <center><img src = /images/1.png width = 30%></center>
- [ ] 主要功能
  - [ ] 全局 UI 界面实现功能
    - [ ] 支持缩放
    - [ ] 支持用户对其它人的作品进行点赞和评论
    - [ ] 支持用户通过鼠标悬浮查看一个作品的缩略信息窗口，比如作者、最热评论和点赞数。
    - [ ] 支持用户通过缩略信息窗口的放大按键查看作品的完整信息
    - [ ] 支持用户在全局 UI 界面划定区域加入个人工作区进行创作
  - [ ] 个人工作区 UI 界面功能
    - [ ] 笔刷效果（拖拽批量绘制像素块）
    - [ ] RGB 调色盘
    - [ ] 支持用户设置若干个常用色
    - [ ] 橡皮擦
    - [ ] 透明度设置（Optional）
    - [ ] 支持用户释放个人工作区
    - [ ] 支持用户提交个人作品进入缓冲区等待审核
  - [ ] 插件：普通图片转像素画（可能需要 AI 算法，Optional）
  - [ ] 添加用户指南（Optional）
  - [ ] 支持多用户协作完成一片区域（Optional）
