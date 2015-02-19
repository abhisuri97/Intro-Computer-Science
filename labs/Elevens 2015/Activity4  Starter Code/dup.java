
/**
 * Write a description of class dup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dup
{
    public static void main (String args[]) {
        for(int i = 48; i < 54; i++ ) { 
            System.out.println("\\begin{equation*}\r\n\\boxed{\r\n\\begin{aligned}\r\na&=\\frac{h}{.5*t^2}=\\frac{.846\\,m}{.5*(\\inccell{calculations.xls!Sheet1!E}\\,s)^2}\\\\\r\n\t&=\\bf \\inccell{calculations.xls!Sheet1!G"+i+"}\\frac{m}{s^2}\\\\\r\n\\\r\n\\alpha     &= \\frac{a}{r}=\\frac{\\inccell{calculations.xls!Sheet1!G"+i+"}\\,\\frac{m}{s^2}}{.012505\\,m} \\\\        \r\n        &=  \\bf \\inccell{calculations.xls!Sheet1!H"+i+"} \\frac{rad}{s^2}\\\\\r\n\\\r\nT&=m(g-a)\\\\\r\n&=\\bf \\inccell{calculations.xls!Sheet1!I"+i+"}\\,kg\r\n     \\\\\\\r\n\\tau&=r*T=(.012505\\,m)*( \\inccell{calculations.xls!Sheet1!I"+i+"}\\,kg)\\\\\r\n&=\\bf  \\inccell{calculations.xls!Sheet1!J"+i+"}\\,kgm\r\n\\\\\\\r\n\\end{aligned}\r\n\\begin{aligned}\r\nI_{tot}&=\\frac{\\tau}{\\alpha}=\\frac{ \\inccell{calculations.xls!Sheet1!J"+i+"}\\,kgm}{\\inccell{calculations.xls!Sheet1!H"+i+"} \\frac{rad}{s^2}}\\\\\r\n&=\\bf\\inccell{calculations.xls!Sheet1!K"+i+"}\\,kgm^2\\\\\r\n\\\r\nI_{exp}&=\\inccell{calculations.xls!Sheet1!K"+i+"} - \\inccell{calculations.xls!Sheet1!P"+i+"}\\\\\r\n&= \\bf\\inccell{calculations.xls!Sheet1!L"+i+"}\\,kgm^2\\\\\r\n\\\r\nI_{theor}&=Md^2\\\\\r\n&=(1.3991)(\\inccell{calculations.xls!Sheet1!A"+i+"})\\\\\r\n&=\\bf\\inccell{calculations.xls!Sheet1!M"+i+"}\\,kgm^2\\\\\r\n\\\r\n\\%\\,dif &= 100*\\frac{|theor. - exper.|}{\\frac{theor.+exper.}{2}}\\\\\r\n&=100*\\frac{| \\inccell{calculations.xls!Sheet1!M"+i+"}\\,kgm^2\\ - \\inccell{calculations.xls!Sheet1!L"+i+"}\\,kgm^2|}{\\frac{.\\inccell{calculations.xls!Sheet1!M"+i+"}\\,kgm^2\\ + \\inccell{calculations.xls!Sheet1!L"+i+"}\\,kgm^2}{2}}\\\\\r\n&=\\bf\\inccell{calculations.xls!Sheet1!O"+i+"}\\%\r\n\\\r\n\\end{aligned}}\r\n\\end{equation*}\n\n\n\n");
        }
    }
}
