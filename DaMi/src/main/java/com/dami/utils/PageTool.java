package com.dami.utils;

public class PageTool {
	private int pageSize;//ҳ����
	private int totalCount;//�ܼ�¼��
	private int totalPages;//��ҳ��
	private int currentPage;//��ǰҳ��
	private int prePage;//��һҳ
	private int nextPage;//��һҳ
	private int startIndex;//ÿһ����¼����ʼ�±�
	@Override
	public String toString() {
		return "PageTool [pageSize=" + pageSize + ", totalCount=" + totalCount + ", totalPages=" + totalPages
				+ ", currentPage=" + currentPage + ", prePage=" + prePage + ", nextPage=" + nextPage + ", startIndex="
				+ startIndex + "]";
	}
	
	public PageTool(int totalCount, String currentPage) {
		
		this.totalCount = totalCount;
		
		this.pageSize = 5;//ҳ����д��,���ǿ����޸�

		initCurrentPage(currentPage);
		
		initTotalPages();
		
		initPrePage();
		
		initNextPage();
		
		initStartIndex();
	}
	//��ǰҳ���ʼ��
	private void initCurrentPage(String currentPage) {

		this.currentPage = currentPage==null ? 1 : Integer.valueOf(currentPage);
	
	}
	//��ʼ����ҳ����
	private void initTotalPages() {
		
		this.totalPages = totalCount/pageSize + (totalCount % pageSize ==0 ? 0 : 1);
	}
	//��ʼ����һҳ
	private void initPrePage() {
		if(currentPage==1) {
			this.prePage=1;
		}else {
			this.prePage = currentPage - 1;
		}
	}
	//��ʼ����һҳ
	private void initNextPage() {
		if(currentPage == totalPages) {
			this.nextPage = totalPages;
		}else {
			this.nextPage = currentPage+1;
		}
	}
	//��ʼ����ʼ�±�
	private void initStartIndex() {
		this.startIndex = pageSize*(currentPage-1);
	}
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPrePage() {
		return prePage;
	}
	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

}
