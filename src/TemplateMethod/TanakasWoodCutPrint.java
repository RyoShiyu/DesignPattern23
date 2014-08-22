package TemplateMethod;

public class TanakasWoodCutPrint extends WoodCutPrint{
    public void draw( Cuttable hanzai ){
        System.out.println("熊の家族の絵を描く");
    }
    public void cut( Cuttable hanzai ){
        System.out.println("彫刻刀を使って爪も彫る");
    }
    public void print( Cuttable hanzai ){
        System.out.println("簡単にプリントする");
    }
}
