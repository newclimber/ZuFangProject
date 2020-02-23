//package cn.xcz.haoke.generator;
//
//import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.*;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
//import org.apache.commons.lang3.StringUtils;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class CodeGenerator {
//    public static String scanner (String tip) {
//        Scanner scanner = new Scanner(System.in);
//        StringBuilder help = new StringBuilder();
//        help.append("请输入"+tip+":");
//        System.out.println(help.toString());
//        if(scanner.hasNext()){
//            String ipt = scanner.next();
//            if(StringUtils.isNotEmpty(ipt)){
//                return ipt;
//            }
//        }
//       throw new MybatisPlusException("请输入正确的"+tip+"!");
//    }
//
//    public static void main(String[] args) {
//        //代码生成器
//        AutoGenerator mpg = new AutoGenerator();
//
//        //全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath+"/src/main/java");
//        gc.setAuthor("xcz");
//        gc.setOpen(false);
//        mpg.setGlobalConfig(gc);
//
//
//        //数据源配置
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://192.168.131.129:3306/haoke?useUnicode=true&characterEncoding=utf8&autoReconnect=true&allowMultiQueries=true");
//
//        //dsc.setSchemaName("public")
//        dsc.setDriverName("com.mysql.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("root");
//        mpg.setDataSource(dsc);
//
//        //包配置
//        PackageConfig pc = new PackageConfig();
//        pc.setModuleName(scanner("模块名"));
//        pc.setParent("cn.xcz.haoke.dubbo.server");
//        mpg.setPackageInfo(pc);
//
//        //自定义配置
//        InjectionConfig cfg = new InjectionConfig() {
//            @Override
//            public void initMap() {
//                // to do sth.
//            }
//        };
//        List<FileOutConfig> focList = new ArrayList<>();
//        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
//            @Override
//            public String outputFile(TableInfo tableInfo) {
//                //自定义输入文件名称
//                return projectPath + "src/main/resources/mapper/"+pc.getModuleName()
//                        +"/"+tableInfo.getEntityName()+"Mapper"+ ".xml";
//            }
//        });
//        cfg.setFileOutConfigList(focList);
//        mpg.setCfg(cfg);
//        mpg.setTemplate(new TemplateConfig().setXml(null));
//
//        //策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setSuperEntityClass("com.baomidou.ant.common.BaseController");
//        strategy.setInclude(scanner("表名"));
//        strategy.setSuperEntityColumns("id");
//        strategy.setTablePrefix(pc.getModuleName()+"_");
//        mpg.setStrategy(strategy);
//        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
//        mpg.execute();
//    }
//}
