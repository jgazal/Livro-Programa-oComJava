package Capitulo11;

import java.io.*;

public class FilterExt implements FilenameFilter {
    String ext;

    public FilterExt(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
