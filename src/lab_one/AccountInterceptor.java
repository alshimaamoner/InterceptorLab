/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_one;

import entity.Account;
import java.io.Serializable;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

/**
 *
 * @author DELL
 */
public class AccountInterceptor extends EmptyInterceptor{

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        System.out.println("User Entity is "+(Account)entity);
        for(int i=0;i<propertyNames.length;i++){
            String name=propertyNames[i];
            if(name.equals("fullName"))
                state[i]="shosho";
        }
        return false;
    }

    @Override
    public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        super.onDelete(entity, id, state, propertyNames, types); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {
        return super.onFlushDirty(entity, id, currentState, previousState, propertyNames, types); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        return super.onLoad(entity, id, state, propertyNames, types); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void afterTransactionBegin(Transaction tx) {
        super.afterTransactionBegin(tx); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    
}
