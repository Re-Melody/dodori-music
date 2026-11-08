package com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation;

import N8.n;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterNavigationState {
    public static final int $stable = 0;
    private final Deque<CustomerCenterDestination> backStack;
    private final String managementScreenTitle;
    private final boolean showingActivePurchasesScreen;

    public CustomerCenterNavigationState(boolean z10, String str, Deque<CustomerCenterDestination> backStack) {
        m.f(backStack, "backStack");
        this.showingActivePurchasesScreen = z10;
        this.managementScreenTitle = str;
        this.backStack = backStack;
    }

    private final boolean component1() {
        return this.showingActivePurchasesScreen;
    }

    private final String component2() {
        return this.managementScreenTitle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomerCenterNavigationState copy$default(CustomerCenterNavigationState customerCenterNavigationState, boolean z10, String str, Deque deque, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = customerCenterNavigationState.showingActivePurchasesScreen;
        }
        if ((i10 & 2) != 0) {
            str = customerCenterNavigationState.managementScreenTitle;
        }
        if ((i10 & 4) != 0) {
            deque = customerCenterNavigationState.backStack;
        }
        return customerCenterNavigationState.copy(z10, str, deque);
    }

    public final Deque<CustomerCenterDestination> component3() {
        return this.backStack;
    }

    public final CustomerCenterNavigationState copy(boolean z10, String str, Deque<CustomerCenterDestination> backStack) {
        m.f(backStack, "backStack");
        return new CustomerCenterNavigationState(z10, str, backStack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomerCenterNavigationState)) {
            return false;
        }
        CustomerCenterNavigationState customerCenterNavigationState = (CustomerCenterNavigationState) obj;
        return this.showingActivePurchasesScreen == customerCenterNavigationState.showingActivePurchasesScreen && m.b(this.managementScreenTitle, customerCenterNavigationState.managementScreenTitle) && m.b(this.backStack, customerCenterNavigationState.backStack);
    }

    public final Deque<CustomerCenterDestination> getBackStack() {
        return this.backStack;
    }

    public final boolean getCanNavigateBack() {
        return this.backStack.size() > 1;
    }

    public final CustomerCenterDestination getCurrentDestination() {
        CustomerCenterDestination customerCenterDestinationPeek = this.backStack.peek();
        return customerCenterDestinationPeek == null ? new CustomerCenterDestination.Main(this.showingActivePurchasesScreen, this.managementScreenTitle) : customerCenterDestinationPeek;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.showingActivePurchasesScreen) * 31;
        String str = this.managementScreenTitle;
        return this.backStack.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final boolean isBackwardTransition(CustomerCenterDestination from, CustomerCenterDestination to) {
        m.f(from, "from");
        m.f(to, "to");
        if ((to instanceof CustomerCenterDestination.Main) && !(from instanceof CustomerCenterDestination.Main)) {
            return true;
        }
        List listW0 = n.W0(this.backStack);
        int iIndexOf = listW0.indexOf(from);
        int iIndexOf2 = listW0.indexOf(to);
        if (iIndexOf2 != -1 && iIndexOf != -1) {
            return iIndexOf2 > iIndexOf;
        }
        Logger.INSTANCE.e("One of the destinations (" + from + " [" + iIndexOf + "], " + to + " [" + iIndexOf2 + "]) is not in the back stack. Assuming forward transition.");
        return false;
    }

    public final CustomerCenterNavigationState pop() {
        if (!getCanNavigateBack()) {
            return this;
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.backStack);
        arrayDeque.pop();
        return copy$default(this, false, null, arrayDeque, 3, null);
    }

    public final CustomerCenterNavigationState popToMain() {
        ArrayDeque arrayDeque = new ArrayDeque(this.backStack);
        while (!arrayDeque.isEmpty() && !(arrayDeque.peek() instanceof CustomerCenterDestination.Main)) {
            arrayDeque.pop();
        }
        if (!arrayDeque.isEmpty()) {
            return copy$default(this, false, null, arrayDeque, 3, null);
        }
        Logger.INSTANCE.e("Could not find Main destination in the back stack. Returning unchanged state.");
        return this;
    }

    public final CustomerCenterNavigationState push(CustomerCenterDestination destination) {
        m.f(destination, "destination");
        ArrayDeque arrayDeque = new ArrayDeque(this.backStack);
        arrayDeque.push(destination);
        return copy$default(this, false, null, arrayDeque, 3, null);
    }

    public String toString() {
        return "CustomerCenterNavigationState(showingActivePurchasesScreen=" + this.showingActivePurchasesScreen + ", managementScreenTitle=" + this.managementScreenTitle + ", backStack=" + this.backStack + ')';
    }

    public /* synthetic */ CustomerCenterNavigationState(boolean z10, String str, Deque deque, int i10, f fVar) {
        Deque deque2 = deque;
        if ((i10 & 4) != 0) {
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.push(new CustomerCenterDestination.Main(z10, str));
            deque2 = arrayDeque;
        }
        this(z10, str, deque2);
    }
}
