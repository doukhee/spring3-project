package kr.co.demo.site.dao;

import java.util.List;

import kr.co.demo.site.vo.SiteVO;
import kr.co.demo.util.Criteria;

public interface SiteDao {
	
	public boolean RegisteSite(SiteVO site);
	
	public List<SiteVO> pagingSite(Criteria cri);
	
	public boolean DeleteSite(SiteVO site);
	
	public boolean UpdateSite(SiteVO site);
	
	public SiteVO InfoSite(SiteVO site);

}
