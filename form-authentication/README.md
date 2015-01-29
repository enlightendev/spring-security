##About

Showing form based authentication


##

- our static content is in resources/public.

        @Override
        public void configure(WebSecurity web) throws Exception {
            super.configure(web);

            web
                    .ignoring()
                    .antMatchers("/bootstrap-3-dist/**", "/app/**");
        }


