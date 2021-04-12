package kr.co.demo.site.vo;

import java.sql.Timestamp;
import java.util.List;

import kr.co.demo.plot.vo.PlotVO;

public class SiteVO {
	
	private Long idx;
	private String name;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	
	private List<PlotVO> plots;
}
