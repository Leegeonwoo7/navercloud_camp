package multi;

public class MultiFor03 {
	public static void main(String[] args) {
	int dan, i;
	for(i=1; i<=9; i++) {	
		for(dan=2; dan<=9; dan++) {
			System.out.print(dan + " * " + i + " = " + dan*i + "\t");	
		}
		System.out.println();
	}
	}
}


/*
2단 ~ 9단

21=2   31=3   41=4   51=5   61=6   71=7   81=8   91=9
22=4   32=6   42=8   52=10  62=12  72=14  82=16  92=18
23=6   33=9   43=12  53=15  63=18  73=21  83=24  93=27
24=8   34=12  44=16  54=20  64=24  74=28  84=32  94=36
25=10  35=15  45=20  55=25  65=30  75=35  85=40  95=45
26=12  36=18  46=24  56=30  66=36  76=42  86=48  96=54
27=14  37=21  47=28  57=35  67=42  77=49  87=56  97=63
28=16  38=24  48=32  58=40  68=48  78=56  88=64  98=72
29=18  39=27  49=36  59=45  69=54  79=63  89=72  99=81
*/