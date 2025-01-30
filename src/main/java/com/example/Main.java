package com.example;
import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class Main {
    public static void main(String[] args) {
        String markdown = "# Hello, CommonMark!";
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        String html = renderer.render(document);
        System.out.println(html);
    }
}