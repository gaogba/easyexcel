package com.alibaba.excel.read.metadata.holder.xls;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.alibaba.excel.enums.RowTypeEnum;
import com.alibaba.excel.metadata.Cell;
import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.read.metadata.holder.ReadSheetHolder;
import com.alibaba.excel.read.metadata.holder.ReadWorkbookHolder;

/**
 * sheet holder
 *
 * @author Jiaju Zhuang
 */
public class XlsReadSheetHolder extends ReadSheetHolder {
    /**
     * Row type.Temporary storage, last set in <code>ReadRowHolder</code>.
     */
    private RowTypeEnum tempRowType;
    /**
     * Data storage of the current row.
     */
    private Map<Integer, Cell> cellMap;
    /**
     * Index of the current row.
     */
    private Integer rowIndex;
    /**
     * Ignore record.
     */
    private Boolean ignoreRecord;
    /**
     * Temp Cell Data.
     */
    private CellData tempCellData;
    /**
     * Temp object index.
     */
    private Integer tempObjectIndex;
    /**
     * Temp object index.
     */
    private Map<Integer, String> objectCacheMap;

    public XlsReadSheetHolder(ReadSheet readSheet, ReadWorkbookHolder readWorkbookHolder) {
        super(readSheet, readWorkbookHolder);
        cellMap = new LinkedHashMap<Integer, Cell>();
        ignoreRecord = Boolean.FALSE;
        tempRowType = RowTypeEnum.EMPTY;
        objectCacheMap = new HashMap<Integer, String>(16);
    }

    public RowTypeEnum getTempRowType() {
        return tempRowType;
    }

    public void setTempRowType(RowTypeEnum tempRowType) {
        this.tempRowType = tempRowType;
    }

    public Map<Integer, Cell> getCellMap() {
        return cellMap;
    }

    public void setCellMap(Map<Integer, Cell> cellMap) {
        this.cellMap = cellMap;
    }

    public Integer getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    public Boolean getIgnoreRecord() {
        return ignoreRecord;
    }

    public void setIgnoreRecord(Boolean ignoreRecord) {
        this.ignoreRecord = ignoreRecord;
    }

    public CellData getTempCellData() {
        return tempCellData;
    }

    public void setTempCellData(CellData tempCellData) {
        this.tempCellData = tempCellData;
    }

    public Integer getTempObjectIndex() {
        return tempObjectIndex;
    }

    public void setTempObjectIndex(Integer tempObjectIndex) {
        this.tempObjectIndex = tempObjectIndex;
    }

    public Map<Integer, String> getObjectCacheMap() {
        return objectCacheMap;
    }

    public void setObjectCacheMap(Map<Integer, String> objectCacheMap) {
        this.objectCacheMap = objectCacheMap;
    }
}
