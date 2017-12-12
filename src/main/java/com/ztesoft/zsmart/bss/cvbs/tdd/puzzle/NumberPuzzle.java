/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

/** 
 * <Description> <br> 
 *  
 * @author chen.jian<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年12月12日 <br>
 * @since V9.0C<br>
 * @see com.ztesoft.zsmart.bss.cvbs.tdd.puzzle <br>
 */

public class NumberPuzzle {
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @param expect <br>
     * @param enter <br>
     * @return <br>
     */ 
    public String validate(String expect, String enter) {
        if (expect.equals(enter)) {
            return "4A0B";
        }
        
        int aCnt = 0;
        for (int i = 0; i < enter.length(); i++) {
            if (expect.charAt(i) == enter.charAt(i)) {
                aCnt++;
            }
        }
        
        int bCnt = 0;
        for (int i = 0; i < expect.length(); i++) {
            for (int j = 0; j < enter.length(); j++) {
                if (expect.charAt(i) == enter.charAt(j)) {
                    bCnt++;
                }
            }
        }
        bCnt -= aCnt;
        
        return String.format("%dA%dB", aCnt, bCnt);
    }

}
