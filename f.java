package com.practise;
import java.util.Scanner;

public class f {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] vb=new boolean[p.length];
        for(int i=0;i<vb.length;i++){
            vb[i]=s.contains(p[i]);
        }
        return vb;

    }
}