package com.example.rocketmqdemo;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.Collections;

public class CodeGenerator {
    private static void generate() {
        String url = "jdbc:mysql://localhost:3306/wallet?useUnicode=true&useSSL=false&characterEncoding=utf8&serverTimezone=UTC";
        String username = "root";
        String password = "zxc6545398";

        // 先得到当前工程目录
        String projectPath = System.getProperty("user.dir");
        String outputPath = projectPath + "/src/main/java";
        String xmlPath = projectPath + "/src/main/resources/mapper";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("authorxx") // 设置作者
                            .enableSwagger()        // 开启 swagger 模式 默认值:false
                            .disableOpenDir()       // 禁止打开输出目录 默认值:true
                            .outputDir(outputPath); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.rocketmqdemo") // 设置父包名
                            .moduleName(null) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, xmlPath)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableLombok(); // add -> @@Getter and @Setter
                    builder.controllerBuilder().enableRestStyle(); // @Controller -> @RestController
                    builder.entityBuilder().columnNaming(NamingStrategy.no_change); //列名保持不变，下划线不转驼峰法
//                    builder.entityBuilder().fileOverride(); //覆盖已生成实体
                    // 设置需要生成的表名--需要的时候直接替换表名即可
                    builder.addInclude("user")
                            .addTablePrefix("t_"); // 设置过滤表前缀
                })
                .execute();

    }

    public static void main(String[] args) {
        generate();
    }
}
