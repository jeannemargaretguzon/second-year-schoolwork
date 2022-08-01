//n=100
//n=500
//n=1000
//n=5000

main() {
    int n=500;
    int sum=0;
    int i=0, j=0, k=0;
	for (i = 0; i < n; ++i){
		for (j = 0; j < i * i; ++j){
			for (k = 0; k < j; ++k){
			++sum;
			}			
		}
	}
}	



