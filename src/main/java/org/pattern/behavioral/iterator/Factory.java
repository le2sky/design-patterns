package org.pattern.behavioral.iterator;

public abstract class Factory {
    // 템플릿 메서드
    public final Iterator create(Aggregate list, int type) {
        Iterator p = createProduct(list, type);
        return p;
    }
    protected abstract Iterator createProduct(Aggregate list, int type);
}
