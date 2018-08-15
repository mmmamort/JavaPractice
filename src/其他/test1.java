package 其他;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class test1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "tom");
    }
}
