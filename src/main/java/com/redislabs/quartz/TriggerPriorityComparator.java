package com.redislabs.quartz;

import java.util.Comparator;
import org.quartz.spi.OperableTrigger;

/**
 * Comparator to sort triggers by priority
 *
 * @author Jens Peters
 */
public class TriggerPriorityComparator implements Comparator<OperableTrigger> {

   /**
    * Implemented compare logic
    *
    * @param trigger1
    * @param trigger2
    * @return
    */
   @Override
   public int compare(OperableTrigger trigger1, OperableTrigger trigger2) {
      if (trigger1.getPriority() < trigger2.getPriority()) {
         return -1;
      }
      if (trigger1.getPriority() > trigger2.getPriority()) {
         return 1;
      }
      return 0;
   }
}
