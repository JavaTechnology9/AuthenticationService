package com.javatechnology.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;

@Configuration
public class OAuth2Config extends AuthorizationServerConfigurerAdapter{
	@Autowired
	private AuthenticationManager manager;
	@Autowired
	private UserDetailsService userDetailsServices;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("eagleeyee")
		.secret(passwordEncoder.encode("thisissecrecct"))
		.authorizedGrantTypes("refresh_token","password","client_credentials")
		.scopes("webclient","mobileclient");
	}
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.authenticationManager(manager)
		.userDetailsService(userDetailsServices);
	}

}
