package center.jhub.common.list;

import center.jhub.exception.internal.unchecked.EmptyListException;
import center.jhub.exception.internal.unchecked.NegativeNumberException;

import java.util.List;

public class ListHelper {

    /**
     * Gets an item from a list.
     * Returns the module of the index, so it never throws {@link IndexOutOfBoundsException}, but will
     * throw {@link EmptyListException} if list is empty and {@link NegativeNumberException} if index is negative.
     * @param list The list to get the item from.
     * @param index Index of the item.
     * @return The item.
     * @throws EmptyListException if list is empty
     * @throws NegativeNumberException if index is negative
     */
    public static <E> E getAbsolute(List<E> list, int index) throws NegativeNumberException, EmptyListException {
        if (index < 0) throw new NegativeNumberException(index);
        if (list.isEmpty()) throw new EmptyListException();
        return list.get(index % list.size());
    }
}
