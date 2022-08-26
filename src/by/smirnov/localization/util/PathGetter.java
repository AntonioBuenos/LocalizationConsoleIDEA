package by.smirnov.localization.util;

import java.io.File;

import static by.smirnov.localization.repo.Constants.DIR;
import static by.smirnov.localization.repo.Constants.ROOT;

public class PathGetter {
    private PathGetter() {
    }

    public static String getPath(Class<?> aClass, String filename) {
        String root = System.getProperty(DIR);
        String relationPath = aClass.getName()
                .replace(aClass.getSimpleName(), "")
                .replace(".", File.separator);
        return root + File.separator + ROOT + File.separator + relationPath + filename;
    }
}
