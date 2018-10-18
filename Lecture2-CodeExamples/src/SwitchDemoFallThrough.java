public class SwitchDemoFallThrough {

    public static void main(String[] args) {
        int age = 18;
        switch (age) {
            case 15:  
            case 16:  
            case 17:  System.out.println("malak si ne si za barovete");
            		break;
            
            case 18:  
            case 19: 
            case 20: System.out.println("are piqnka idvai tebe chakahme");
            		break;
            
            case 40: 
            case 41: System.out.println("bqgai dyrt ne vajish veche");
            		break;

            default: System.out.println("hodi si zemi lichnata karta");
        }

    }
}
