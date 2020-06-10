package com.myhome.www.article.service;

import java.util.List;

import com.myhome.www.article.dto.Article;

public interface ArticleService {

	//게시글 리스트
		List<Article> selectArticleList(Article article) throws Exception;	
		//글등록
		int insertArticle(Article article) throws Exception;
		//글번호로 조회
		Article selectArticleByNo(int articleNo) throws Exception;
		//아이디로 글조회
		List<Article> selectArticleByWriterId(String writerId) throws Exception;
		//글수정
		int updateArticle(Article article) throws Exception;
		//글삭제
		int deleteArticle(Article article) throws Exception;
		//등록한 글번호로 보기
		int selectLastArticleNo() throws Exception;
		//키워드로 게시글 조회
		List<Article> selectSearchArticleList(String keyword) throws Exception;
		//검색 타입과 키워드로 게시글 조회
		List<Article> selectSearchTypeArticleList(String searchType, String keyword) throws Exception;
		//전체 글 갯수 조회
		int selectAllCount() throws Exception;
		//파일등록
		Article store(Article article);
}