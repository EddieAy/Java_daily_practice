package Buffer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class BufferedReaderNetworkExample {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            // 创建URL对象
            URL url = new URL("https://www.baidu.com");

            // 打开连接
            URLConnection connection = url.openConnection();

            // 使用InputStreamReader和BufferedReader读取网络数据
            InputStreamReader isr = new InputStreamReader(connection.getInputStream());
            br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                // 处理每一行的数据
                System.out.println(line);
            }

        } catch (IOException e) {
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
