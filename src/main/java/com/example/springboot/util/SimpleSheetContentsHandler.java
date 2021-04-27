package com.example.springboot.util;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFComment;

import java.util.LinkedList;
import java.util.List;

public class SimpleSheetContentsHandler implements XSSFSheetXMLHandler.SheetContentsHandler {

    protected List<String> row;

    @Override
    public void startRow(int i) {
        row = new LinkedList<>();

    }

    @Override
    public void endRow(int i) {

    }

    @Override
    public void cell(String s, String s1, XSSFComment xssfComment) {

    }

    @Override
    public void headerFooter(String s, boolean b, String s1) {

    }
}
