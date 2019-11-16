package endorphin.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Board 主题板块实体类
 *
 * @author igaozp
 * @version 1.2
 * @since 2016
 */
@Data
public class Board implements Serializable {
    private static final long serialVersionUID = -3819164942441457067L;
    /**
     * 板块ID，数据库自增
     */
    private Integer boardId;
    /**
     * 板块名称
     */
    private String boardName;
    /**
     * 板块描述
     */
    private String boardDesc;
    /**
     * 创建时间
     */
    private Timestamp createTime;
    /**
     * 修改时间
     */
    private Timestamp updateTime;
}
