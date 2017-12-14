/**************************************************************************************** 
 Copyright © 2003-2017 ZTEsoft Corporation. All rights reserved. Reproduction or       <br>
 transmission in whole or in part, in any form or by any means, electronic, mechanical <br>
 or otherwise, is prohibited without the prior written consent of the copyright owner. <br>
 ****************************************************************************************/
package com.ztesoft.zsmart.bss.cvbs.tdd.puzzle;

import java.util.Random;

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

public class PuzzleNumberDto {
    
    private String value;
    
    private int aCnt;
    
    private int bCnt;

    /**
     * Description: <br>
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @return value <br>
     */
    public String getValue() {
        return value;
    }

    /**
     * Description: <br>
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @param value <br>
     */
    public void setValue(String value) {
        this.value = value;
    }
    
    /**
     * Description: <br>
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @return aCnt <br>
     */
    public int getaCnt() {
        return aCnt;
    }

    /**
     * Description: <br>
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @param aCnt <br>
     */
    public void setaCnt(int aCnt) {
        this.aCnt = aCnt;
    }

    /**
     * Description: <br>
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @return bCnt <br>
     */
    public int getbCnt() {
        return bCnt;
    }

    /**
     * Description: <br>
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @param bCnt <br>
     */
    public void setbCnt(int bCnt) {
        this.bCnt = bCnt;
    }

    /**
     * Description: <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @param length <br>
     */ 
    public void generateNoRepeatValue(int length) {
        StringBuilder sb = new StringBuilder("");
        
        for (int i = 0; i < length; i++) {
            String random = String.valueOf(generateRandom());
            if (sb.toString().contains(random)) {
                continue;
            }
            
            sb.append(random);
        }
        
        this.value = sb.toString();
    }
    
    /**
     * Description: 生成 1- 9 随机数 <br> 
     *  
     * @author chen.jian<br>
     * @taskId <br>
     * @return <br>
     */ 
    private int generateRandom() {
        Random random = new Random();
        return random.nextInt(9) + 1;
    }

}
