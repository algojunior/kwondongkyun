import java.util.*;
public class N1026 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0;
        int index=0;
        int []A = new int[N];
        int []B = new int[N];

        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        for(int i=0;i<B.length;i++){
            B[i]=sc.nextInt();
        }
        
        for(int i=0;i<A.length;i++){
            int max=0;
            for(int j=0;j<B.length;j++){
                if(max<=B[j]){
                    max=B[j];
                    index=j;
                }
            }
            sum+=A[i]*max;
            B[index]=0;
        }
        System.out.println(sum);
    }
}

- A 정렬(오름차순)
- B 원소 최댓값과 *
- sum+
