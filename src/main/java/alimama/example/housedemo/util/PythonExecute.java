package alimama.example.housedemo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PythonExecute {
    public static void exec() {
        BufferedReader br = null;
//D:\work\pycharm\PycharmProjects\bspra1\next
        String[] args1 = new String[]{"python ", "D:\\work\\pycharm\\PycharmProjects\\bspra1\\next\\main.py"};
        //process是一个抽象类，所有接口都抽象；所以不需要知道他怎么实现，只需要知道他能创建一个进程，并返回process的一个实例
        try {
            Process process = Runtime.getRuntime().exec(args1);//进程负责执行文件并取得结果
            //以下几行用IO流取出process中的结果，要多用用stringbuilder了
            br = new BufferedReader(new InputStreamReader(process.getInputStream(), "utf-8"));//字节流包装成字符流再包装成缓冲字符流
            StringBuilder builder = new StringBuilder();
            String line = null;
            while ((line = br.readLine()) != null) {//每读取一行，存进builder里
                builder.append(line);
                System.out.println(line);
            }
            process.waitFor();//让进程不结束，一直等到用process表示的进程终止
//            System.out.println(builder.toString());
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
