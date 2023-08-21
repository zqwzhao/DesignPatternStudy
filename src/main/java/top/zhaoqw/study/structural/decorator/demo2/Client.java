package top.zhaoqw.study.structural.decorator.demo2;

public class Client {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary / John Smith,100000 / Steven Jobs";
        DataSource dataSource = new EncryptionDecorator(new JsonDecorator(
                new FileDataSource("d:/code/OutputDemo.txt")));
        dataSource.writeData(salaryRecords);
        DataSource plain = new FileDataSource("d:/code/OutputDemo.txt");
        System.out.println("- Data ----------------");
        System.out.println(salaryRecords);
        System.out.println("- EncodedContent --------------");
        System.out.println(plain.readData());
        System.out.println("- DecodedContent --------------");
        System.out.println(dataSource.readData());
    }
}