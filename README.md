# SpringHandlerMappingsDemo
This is a demo project to demonstrate how Spring HandlerMappings work. Basically when a request arrives at the dispatcher servlet,
it uses the default handler mappings which are org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping and org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping
to control the routing of requests to handler objects. However, this behavior can be overridden by defining your own custom handlermapping
and configuring it in <>-servlet.xml
