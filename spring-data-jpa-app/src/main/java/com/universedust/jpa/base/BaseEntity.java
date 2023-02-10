//package com.universedust.jpa.base;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import jakarta.persistence.Column;
//import jakarta.persistence.MappedSuperclass;
//import jakarta.persistence.Version;
//import lombok.Data;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import java.io.Serial;
//import java.io.Serializable;
//import java.time.LocalDateTime;
//
//@Data
//
//@MappedSuperclass
//public abstract class BaseEntity implements Serializable {
//
//    @Serial
//    private static final long serialVersionUID = 3381199444893742198L;
//
//    /**
//     * 创建时间
//     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @Column(name = "create_time",nullable = false)
//    @CreatedDate
//    private LocalDateTime createTime;
//
//    /**
//     * 更新时间
//     */
//    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
//    @Column(name = "update_time")
//    @LastModifiedDate
//    private LocalDateTime updateTime;
//
//    /**
//     * 乐观锁
//     */
//    @Version
//    private Integer version;
//
//
//    @Column(name = "delete_flag", columnDefinition = "tinyint  DEFAULT 0 comment '0-未删除，1-已删除' ")
////    @ColumnDefault("0")
//    private Integer deleteFlag;
//
//    /**
//     * 全局code,
//     */
//    private Long code;
//
//
//    public LocalDateTime getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(LocalDateTime createTime) {
//        this.createTime = createTime;
//    }
//
//    public LocalDateTime getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(LocalDateTime updateTime) {
//        this.updateTime = updateTime;
//    }
//
//
//    public Integer getVersion() {
//        return version;
//    }
//
//    public void setVersion(Integer version) {
//        this.version = version;
//    }
//
//    public Integer getDeleteFlag() {
//        return deleteFlag;
//    }
//
//    public void setDeleteFlag(Integer deleteFlag) {
//        this.deleteFlag = deleteFlag;
//    }
//
//    public Long getCode() {
//        return code;
//    }
//
//    public void setCode(Long code) {
//        this.code = code;
//    }
//}
