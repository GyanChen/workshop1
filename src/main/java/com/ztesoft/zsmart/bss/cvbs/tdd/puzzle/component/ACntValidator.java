/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle.component;

import com.ztesoft.zsmart.bss.cvbs.tdd.puzzle.AbsNumberValidator;
import com.ztesoft.zsmart.bss.cvbs.tdd.puzzle.NumberValidate;
import com.ztesoft.zsmart.bss.cvbs.tdd.puzzle.PuzzleNumberDto;

/** 
 * <Description> <br> 
 *  
 * @author chen.jian<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2017年12月14日 <br>
 * @since V9.0C<br>
 * @see com.ztesoft.zsmart.bss.cvbs.tdd.puzzle.component <br>
 */

public class ACntValidator extends AbsNumberValidator implements NumberValidate {

    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @param systemNumber <br>
     * @param enterNumber <br>
     */
    @Override
    public void validate(PuzzleNumberDto systemNumber, PuzzleNumberDto enterNumber) {
        String expect = systemNumber.getValue();
        String enter = enterNumber.getValue();
        
        int aCnt = 0;
        for (int i = 0; i < enter.length(); i++) {
            if (expect.charAt(i) == enter.charAt(i)) {
                aCnt++;
            }
        }
        
        enterNumber.setaCnt(aCnt);
        
        if (null != this.getNumberValidator()) {
            this.getNumberValidator().validate(systemNumber, enterNumber);
        }
    }

}
