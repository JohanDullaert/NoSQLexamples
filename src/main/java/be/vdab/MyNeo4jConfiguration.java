package be.vdab;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.data.neo4j.server.RemoteServer;


@Configuration
@EnableNeo4jRepositories
public class MyNeo4jConfiguration extends Neo4jConfiguration {

	@Override
	@Bean
	public SessionFactory getSessionFactory() {
		return new SessionFactory("be.vdab.model");
	}

	@Override
	@Bean
	public Neo4jServer neo4jServer() {
		return new RemoteServer("http://localhost:7474", "neo4j", "vdab");
	}

}
