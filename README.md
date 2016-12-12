#some knowledge
## config-server
配置服务器,主要负责spring 配置文件仓库存放
##











##Docker
最流行的软件容器平台
###基础知识
1. image : 镜像.一个文件系统,状态不能改变
2. container: 容器, docker 开启一个容器,一般通过docker run image 启动一个容器,容器通过镜像构建一个应用环境.
3. docker run some-images COMMAND .启动一个容器(可携带参数或者命令)
4. docker build -t image . 通过Dockerfile 构建一个镜像
5. docker run -t -i image /bin/bash  : 交互模式
6. docker run -d image : 后台运行.
6. docker --help : docker 下所有的命令可以通过--help 查看使用帮助.
7. docker ps : 查看所有的容器.
8. docker logs -f container: 查看日志
9. docker inspect container: 查看容器配置详情.
10. docker stop/rm container: 启动和删除.
11. docker images : 查看镜像.
12. docker pull image : 下载一个镜像.
13. docker run -v /Users/<path>:/<conatiner path> : mount 文件夹
14. Dockerfile : 构建镜像文件[文档参考](https://docs.docker.com/engine/reference/builder/)
    1. FROM: 必须首先指定基础镜像
    2. RUN: 运行命令,一般docker run 指定 or docker exec 
    3. CMD: shell 命令
    4. LABEL: metadata
    5. EXPOSE: 暴露端口
    6. ENV: 环境变量 key,value形式.
    7. ADD. 创建文件,文件夹
    8. COPY: 复制 src --dest
    9. ENTRYPOINT: 运行命令
    10. VOLUME: mount
    11. USER: 运行用户
    12. WORKDIR: 定位文件夹

### 需求描述
1. 使用一个容器,来放置config-server. 暴露端口9999
2. 程序编译之后是否可以自动发布容器呢?

