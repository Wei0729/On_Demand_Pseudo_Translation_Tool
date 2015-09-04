/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package esrixstringlocalization;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author trisoft-admin
 */
public class checkPassolo {
    
  public static void main(String[] args) throws Exception 
  {

        try {
        String line;
       // Process p = Runtime.getRuntime().exec("ps -e");
        Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
        BufferedReader input =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = input.readLine()) != null) 
        {
            if (line.contains("psl.exe"))
            {
                System.out.println(line); //<-- Parse data here.
            }        

        }
        input.close();
    } catch (Exception err) {
        err.printStackTrace();
    }
  }
}
