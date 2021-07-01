package io.toman.utils;

import org.apache.commons.collections.CollectionUtils;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;


public class DozerUtils {


    private static DozerBeanMapper mapper = new DozerBeanMapper();


    /**
     * 单个对象数据转换
     *
     * @param source
     * @param destinationClass
     * @param <T>
     * @return
     */
    public static <T> T convert(Object source, Class<T> destinationClass) {
        if (source != null) {
            return mapper.map(source, destinationClass);
        }
        return null;
    }

    /**
     * 列表数据转换
     *
     * @param sourceList
     * @param destinationClass
     * @param <T>
     * @param <S>
     * @return
     */
    public static <T, S> List<T> convertList(List<S> sourceList, Class<T> destinationClass) {
        List<T> retList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(sourceList)) {
            for (S source : sourceList) {
                retList.add(mapper.map(source, destinationClass));
            }
            return retList;
        }
        return retList;
    }


}
