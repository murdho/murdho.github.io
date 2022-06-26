<script>
  let yoBadge = "#yo";
  let hereBadge = "here";

  const handleClickYo = () => {
    if (yoBadge.length < 10) {
      yoBadge += "yo";
    }
  };

  const handleClickHere = () => {
    if (hereBadge === "here") {
      hereBadge = "not yet, sorry";
    } else {
      hereBadge = "here";
    }
  };
</script>

<div class="grid grid-cols-1 xl:grid-cols-2">
    <div class="pt-5 pl-5 md:pt-20 md:pl-20 lg:pb-20 grid grid-cols-1 grid-flow-row gap-20 justify-evenly">
        <div>
            <p class="text-2xl">hey! 👋</p>
            <div class="text-xl mt-4">
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-gray-100 hover:bg-gray-50 text-gray-800 mt-1 cursor-not-allowed select-none" on:click={handleClickYo}
                >{yoBadge}</span>
            </div>
        </div>

        <div>
            <p class="text-2xl">my name is</p>
            <div class="text-6xl mt-4">
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-purple-100 hover:bg-purple-50 text-purple-800 mt-1 cursor-not-allowed">Murdho</span>
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-yellow-100 hover:bg-yellow-50 text-yellow-800 mt-1 cursor-not-allowed">Savila</span>
            </div>
        </div>

        <div>
            <p class="text-2xl">currently living in</p>
            <div class="text-xl mt-4">
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-indigo-100 text-indigo-800 hover:bg-indigo-50 mt-1 cursor-not-allowed">#helsinki</span>
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-purple-100 text-purple-800 hover:bg-purple-50 mt-1 cursor-not-allowed">#finland</span>
            </div>
        </div>

        <div>
            <p class="text-2xl">first appeared in</p>
            <div class="text-xl mt-4">
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-yellow-100 text-yellow-800 hover:bg-yellow-50 mt-1 cursor-not-allowed">#tallinn</span>
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-pink-100 text-pink-800 hover:bg-pink-50 mt-1 cursor-not-allowed">#estonia</span>
            </div>
        </div>

        <div>
            <p class="text-2xl">i'm writing code and loving it ❤️</p>
            <div class="text-xl mt-4">
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-green-100 text-green-800 hover:bg-green-50 mt-1 cursor-not-allowed">#clojure</span>
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-blue-100 text-blue-800 hover:bg-blue-50 mt-1 cursor-not-allowed">#go</span>
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-pink-100 text-pink-800 hover:bg-pink-50 mt-1 cursor-not-allowed">#ruby</span>
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-red-100 text-red-800 hover:bg-red-50 mt-1 cursor-not-allowed">#rust</span>
            </div>
        </div>

        <div>
            <p class="text-2xl">some code is in</p>
            <div class="mt-4 text-xl">
                <a href="https://github.com/murdho" target="_blank">
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-gray-100 hover:bg-gray-50 text-gray-800 mt-1 cursor-pointer">
                    github&nbsp;
                    <svg class="h-5 w-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
                      <path d="M11 3a1 1 0 100 2h2.586l-6.293 6.293a1 1 0 101.414 1.414L15 6.414V9a1 1 0 102 0V4a1 1 0 00-1-1h-5z"/>
                      <path d="M5 5a2 2 0 00-2 2v8a2 2 0 002 2h8a2 2 0 002-2v-3a1 1 0 10-2 0v3H5V7h3a1 1 0 000-2H5z"/>
                    </svg>
                </span>
                </a>
            </div>
        </div>

        <div>
            <p class="text-2xl">professional stuff is in</p>
            <div class="mt-4 text-xl">
                <a href="https://www.linkedin.com/in/murdho/" target="_blank">
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-blue-100 hover:bg-blue-50 text-blue-800 mt-1 cursor-pointer">
                    linkedin&nbsp;
                    <svg class="h-5 w-5" fill="currentColor" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg">
                      <path d="M11 3a1 1 0 100 2h2.586l-6.293 6.293a1 1 0 101.414 1.414L15 6.414V9a1 1 0 102 0V4a1 1 0 00-1-1h-5z"/>
                      <path d="M5 5a2 2 0 00-2 2v8a2 2 0 002 2h8a2 2 0 002-2v-3a1 1 0 10-2 0v3H5V7h3a1 1 0 000-2H5z"/>
                    </svg>
                </span>
                </a>
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-green-100 text-green-800 hover:bg-green-50 mt-1 cursor-not-allowed">#software-engineer</span>
            </div>
        </div>

        <div>
            <p class="text-2xl">and some random stuff is</p>
            <div class="mt-4 text-xl">
                <a href="/#" on:click|preventDefault={handleClickHere}>
                    <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-pink-100 hover:bg-pink-50 text-pink-800 mt-1 cursor-not-allowed">{hereBadge}</span>
                </a>
                <span class="inline-flex items-center px-3 py-2 rounded-md font-medium bg-purple-100 hover:bg-purple-50 text-purple-800 mt-1 cursor-not-allowed">#itiswhatitis</span>
            </div>
        </div>
    </div>
    <div class="place-self-end lg:fixed lg:bottom-0 -z-10">
        <img alt="murdho caricature" class="h-full w-full max-w-[800px]" src="/murdho.png"/>
    </div>
</div>
