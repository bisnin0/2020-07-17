class Test
{
	public static void main(String[] args) 
	{
		int i, j, k;
		j=1;

		for(k = 1 ; k <= 9 ; k += 3){
			System.out.printf("%d�� \t\t%d�� \t\t%d�� \n", j, ++j, ++j);
			for(i = 1; i <= 9; i++){
				for(j = k ; j < k+3 ; j++){
					System.out.printf("%d*%d=%2d  \t", j, i, i*j);
				}System.out.println();
			}System.out.println();
		}

	//������ ���ۺ��� �����


	}
}
