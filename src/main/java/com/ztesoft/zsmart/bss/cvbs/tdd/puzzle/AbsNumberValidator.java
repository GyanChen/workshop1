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
 * @CreateDate 2017年12月14日 <br>
 * @since V9.0C<br>
 * @see com.ztesoft.zsmart.bss.cvbs.tdd.puzzle <br>
 */

public abstract class AbsNumberValidator implements NumberValidate {
    
    /**
     * numberValidator <br>
     */
    private NumberValidate numberValidator;

    /**
     * Description: <br>
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @return numberValidator <br>
     */
    public NumberValidate getNumberValidator() {
        return numberValidator;
    }

    /**
     * Description: <br>
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @param numberValidator <br>
     */
    public void setNumberValidator(NumberValidate numberValidator) {
        this.numberValidator = numberValidator;
    }

}
