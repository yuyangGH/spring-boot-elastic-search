//package com.qianqiangongzi;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.core.query.IndexQuery;
//import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
//import org.springframework.test.context.junit4.SpringRunner;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes=ElasticSearchApplication.class)
//public class ArticleEsServiceApplicationTests {
//	@Autowired
//	private ElasticsearchTemplate  elasticsearchTemplate;
//	@Test
//	public void testCreate() {
//		TestItem item = new TestItem();
//		item.setId(1);
//		item.setName("深圳智骏");
//		IndexQuery indexQuery = new IndexQueryBuilder().withObject(item).build();
//        elasticsearchTemplate.index(indexQuery);
//	}
//
//}
