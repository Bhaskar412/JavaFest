import java.util.ArrayList;
import java.util.List;

public class PrimeRange {

    public void prime(int n) {
        List<Integer> list = new ArrayList<>();
        int flag;
        int i;
        for(i=2;i<=n;i++){

            flag = 1;
            for(int j=2; j<=i/2;++j){

                if(i%j==0) {
                    flag = 0;
                break;
                }
            }
            if(flag==1)
            list.add(i);
        }
        System.out.println(list);    }
}

