package com.bridgelabz;
/**
 * @author GovardhanReddy
 */
public class ComparisonResult {
    /**
     * Print the results of Line comparison methods
     */
    LineComparison comparison = new LineComparison();
    Double firstLineLength = comparison.lineLength();
    Double secondLineLength = comparison.lineLength();
    public static void main(String[] args) {
        LineComparison lineComparison=new LineComparison();
        ComparisonResult result = new ComparisonResult();
        System.out.println("Use equals method : ");
        lineComparison.equalsMethod(result.firstLineLength,result.secondLineLength);
        System.out.println("Use compare method : ");
        lineComparison.compareMethod(result.firstLineLength,result.secondLineLength);
    }
}
