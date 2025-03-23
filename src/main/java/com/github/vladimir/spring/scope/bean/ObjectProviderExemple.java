package com.github.vladimir.spring.scope.bean;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ObjectProviderExemple {
    private final ObjectProvider<Waiter> waiterObjactProvider;

    private final ObjectProvider<HeadChef> headChefObjectProvider;

    public ObjectProviderExemple(ObjectProvider<Waiter> waiterObjactProvider, ObjectProvider<HeadChef> headChefObjectProvider) {
        this.waiterObjactProvider = waiterObjactProvider;
        this.headChefObjectProvider = headChefObjectProvider;
    }

    public void getAndCompareHeadChef() {
        HeadChef first=headChefObjectProvider.getObject();
        HeadChef second=headChefObjectProvider.getObject();

        System.out.println("HeadChef is equals " +(first==second));
    }

    public void getAndCompareWaiter(){
        Waiter first=waiterObjactProvider.getObject(UUID.randomUUID());
        Waiter second=waiterObjactProvider.getObject(UUID.randomUUID());

        System.out.println("Waiter is equals " +(first==second));
    }
}
