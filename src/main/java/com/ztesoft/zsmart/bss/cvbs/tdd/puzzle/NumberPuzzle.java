/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

import com.ztesoft.zsmart.bss.cvbs.tdd.puzzle.component.ACntValidator;
import com.ztesoft.zsmart.bss.cvbs.tdd.puzzle.component.BCntValidator;

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

public abstract class NumberPuzzle {
    
    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @param expect <br>
     * @param enter <br>
     * @return <br>
     */ 
    public static String validate(PuzzleNumberDto systemNumber, PuzzleNumberDto enterNumber) {
        int aCnt = 0;
        int bCnt = 0;
        
        if (systemNumber.getValue().equals(enterNumber.getValue())) {
            aCnt = systemNumber.getValue().length();
            return String.format("%dA%dB", aCnt, bCnt);
        }
        
        ACntValidator aCntValidator = new ACntValidator();
        BCntValidator bCntValidator = new BCntValidator();
        aCntValidator.setNumberValidator(bCntValidator);
        aCntValidator.validate(systemNumber, enterNumber);
        
        aCnt = enterNumber.getaCnt();
        bCnt = enterNumber.getbCnt();
        return String.format("%dA%dB", aCnt, bCnt - aCnt);
    }

}
