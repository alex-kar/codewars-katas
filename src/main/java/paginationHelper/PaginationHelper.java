package paginationHelper;

import java.util.List;

class PaginationHelper<T> {
    List<T> list;
    int pageSize;

    public PaginationHelper(List<T> list, int pageSize) {
        this.list = list;
        this.pageSize = pageSize;
    }

    public int pageCount() {
        return (int) Math.ceil((double) list.size() / (double) pageSize);
    }

    public int itemCount() {
        return list.size();
    }

    public int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex >= pageCount() || pageSize == 0) {
            return -1;
        }
        int fullPages = list.size() / pageSize;
        int tail = list.size() % pageSize;
        return pageIndex < fullPages ? pageSize : tail;
    }

    public int pageIndex(int itemIndex) {
        System.out.println(String.format("list size %s, page size %s, item index%s", list.size(), pageSize, itemIndex));
        if (itemIndex < 0 || itemIndex >= list.size()) {
            return -1;
        }
        if (itemIndex == 0) {
            return 0;
        }
        return (int) Math.ceil((double) itemIndex / (double) pageSize) - 1;
    }
}
