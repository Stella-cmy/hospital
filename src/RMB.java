import java.util.Scanner;

public class RMB {
    private static final String[] NUM_UPPER = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
    private static final String[] RADICES = {"", "拾", "佰", "仟"};
    private static final String[] BIGGER_RADICES = {"", "万", "亿", "兆"};

    public static String getRMB(String num) {
        StringBuilder result = new StringBuilder("");
        Double money = Double.parseDouble(num);
        if (money == 0) {
            return "零元整";
        }
        String[] s = num.split("\\.");
        Long integral = Long.parseLong(s[0]);//整数部分
        int integralLen = (integral + "").length();
        if (integral > 0) {
            int zeroCount = 0;
            for (int i = 0; i < integralLen; i++)
            {
                int unitLen = integralLen - i - 1;//单位
                int d = Integer.parseInt((integral + "").substring(i, i + 1));//当前数字
                //个、十、百、千 | 万、十万、百万、千万 | 亿、十亿、百亿、千亿 | ... ,以4个数字一个大单位
                int quotient = unitLen / 4;//大单位的下标{"", "万", "亿", "兆"}
                int modulus = unitLen % 4;//获取单位的下标
                if (d == 0) //跳过连续的0
                {
                    zeroCount++;
                } else
                    {
                        if (zeroCount > 0)
                        {
                            result.append(NUM_UPPER[0]);//零
                        }
                        zeroCount = 0;
                        result.append(NUM_UPPER[d]).append(RADICES[modulus]);
                    }
                if (modulus == 0 && zeroCount < 4)
                {
                    result.append(BIGGER_RADICES[quotient]);
                }
            }
            result.append("元");
        }
        if(s.length>1)
        {
            int decimal = Integer.parseInt(s[1]);//小数部分
            if (decimal > 0) {
                int j = decimal / 10;
                if (j > 0) {
                    result.append(NUM_UPPER[j]).append("角");
                }
                j = decimal % 10;
                if (j > 0) {
                    result.append(NUM_UPPER[j]).append("分");
                }
            } else {
                result.append("整");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String num = sca.nextLine();
        System.out.println(getRMB(num));
    }
}