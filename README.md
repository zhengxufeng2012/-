# -fileUpload
項目基于maven+ssm框架完成的,项目主要是用于学习的项目,用于搭建maven和ssm框架主要参考的是http://blog.csdn.net/gebitan505/article/details/44455235/
文档.
项目实现文件上传功能的主要参考的是http://blog.csdn.net/mxw968/article/details/77747354 项目
由于一开始对项目的不了解所以写了dao层,service层 util层 mapping等不相关的文件.
到了后期明白了原来控制文件的上传只是需要一个controller层就可以了

其实文件的上传主要的就是两个jar就是
<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.4</version>
		</dependency>
		<dependency>
			<groupId>commons-fileupload</groupId>
			<artifactId>commons-fileupload</artifactId>
			<version>${commons-fileupload.version}</version>
			<exclusions>
				<exclusion>
					<groupId>commons-io</groupId>
					<artifactId>commons-io</artifactId>
				</exclusion>
			</exclusions>
		</dependency>
    
    然而index等是随便添加的只要你满足你的需求
    controller层的话 主要的就是你文件的名称,存储地址,控制是否有误等情况
    文件的选择主要是空 index中的enctype="multipart/form-data"
